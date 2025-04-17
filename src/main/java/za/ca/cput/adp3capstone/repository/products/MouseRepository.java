package za.ca.cput.adp3capstone.repository.products;

import za.ca.cput.adp3capstone.domain.products.Laptop;
import za.ca.cput.adp3capstone.domain.products.Mouse;

import java.util.HashMap;

public class MouseRepository implements IMouseRepository{
    private static IMouseRepository repository = null;
    private HashMap<Long, Mouse> mice;

    private MouseRepository() {
        repository = getRepository();
        mice = new HashMap<>();
    }

    public static IMouseRepository getRepository() {
        if (repository == null) {
            repository = new MouseRepository();
        }
        return repository;
    }

    @Override
    public HashMap<Long, Mouse> getAll() {
        if(mice == null) {
            return null;
        }
        return  mice;
    }

    @Override
    public Mouse read(Long mouseId) {
        Mouse mouse = mice.get(mouseId);
        if(mouse == null){
            return null;
        }
        return mouse;
    }

    @Override
    public Mouse create(Mouse mouse) {
        if(mouse ==null){
            return null;
        }
        return mice.put(mouse.getProductId(),mouse);
    }

    @Override
    public Mouse update(Mouse mouse) {
        Mouse foundMouse = mice.get(mouse.getProductId());
        if(foundMouse == null){
            return null;
        }
        return mice.put(mouse.getProductId(),mouse);
    }

    @Override
    public boolean delete(Mouse mouse) {
        if(mouse==null){
            return false;
        }
        mice.remove(mouse.getProductId());
        return true;
    }
}
