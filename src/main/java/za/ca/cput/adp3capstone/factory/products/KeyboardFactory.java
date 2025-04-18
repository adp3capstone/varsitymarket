package za.ca.cput.adp3capstone.factory.products;

import za.ca.cput.adp3capstone.domain.products.Keyboard;
import za.ca.cput.adp3capstone.util.Helper;

public class KeyboardFactory {
    public static Keyboard createKeyboard(String layout, String connectionType, boolean backlit) {
        if( Helper.isStringNullOrEmpty(layout)
                || Helper.isStringNullOrEmpty(connectionType))
               // || Helper.isStringNullOrEmpty(backlit))
        {return null;}

        return new Keyboard.Builder()
                .setLayout(layout)
                .setConnectionType(connectionType)
                .setBacklit(backlit)
                .build();
    }
}
