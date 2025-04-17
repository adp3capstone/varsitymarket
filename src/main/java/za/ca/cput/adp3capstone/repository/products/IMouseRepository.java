package za.ca.cput.adp3capstone.repository.products;

/* IMouseRepository.java
Mouse Repository interface
Author: Ethan Le Roux (222622172)
Date:17 April 2025
*/

import za.ca.cput.adp3capstone.domain.products.Mouse;
import za.ca.cput.adp3capstone.repository.IRepository;
import java.util.HashMap;


public interface IMouseRepository extends IRepository<Mouse, Long> {
    HashMap<Long, Mouse> getAll();
}
