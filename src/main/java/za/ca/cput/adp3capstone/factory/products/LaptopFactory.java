package za.ca.cput.adp3capstone.factory.products;

import za.ca.cput.adp3capstone.domain.Category;
import za.ca.cput.adp3capstone.domain.Seller;
import za.ca.cput.adp3capstone.domain.products.Laptop;
import za.ca.cput.adp3capstone.util.Helper;

public class LaptopFactory {
    public static Laptop createLaptop( long productId,
                                       Seller productSeller,
                                       String productName,
                                       Category category,
                                       String description,
                                       String imageUrl,
                                       String brand,
                                       double price,
                                       boolean isSecondHand,
                                       String processor,
                                       int ramSize,
                                       int storageSize,
                                       String storageType,
                                       String graphicsCard,
                                       double screenSize,
                                       String resolution,
                                       String operatingSystem,
                                       double batteryLife,
                                       double weight,
                                       boolean isTouchscreen,
                                       String keyboardLayout,
                                       int amountOfUsbPorts,
                                       boolean hasHdmiPort,
                                       boolean hasWebcam,
                                       boolean isRefurbished)
    {
        if (Helper.isStringNullOrEmpty(productName) ||
                Helper.isStringNullOrEmpty(description) ||
                Helper.isStringNullOrEmpty(imageUrl) ||
                Helper.isStringNullOrEmpty(brand) ||
                productSeller == null || category == null || price <= 0) {
            return null;
        }

        if (Helper.isStringNullOrEmpty(processor) ||
                Helper.isStringNullOrEmpty(storageType) ||
                Helper.isStringNullOrEmpty(graphicsCard) ||
                Helper.isStringNullOrEmpty(resolution) ||
                Helper.isStringNullOrEmpty(operatingSystem) ||
                Helper.isStringNullOrEmpty(keyboardLayout)) {
            return null;
        }

        if (Helper.isIntNegative(ramSize) || Helper.isIntZero(ramSize)) return null;
        if (Helper.isIntNegative(storageSize) || Helper.isIntZero(storageSize)) return null;
        if (Helper.isDoubleNull(screenSize) || screenSize <= 0) return null;
        if (Helper.isDoubleNull(batteryLife) || batteryLife < 0) return null;
        if (Helper.isDoubleNull(weight) || weight <= 0) return null;
        if (Helper.isIntNegative(amountOfUsbPorts)) return null;

        return new Laptop.Builder()
                .productId(productId)
                .productSeller(productSeller)
                .productName(productName)
                .category(category)
                .description(description)
                .imageUrl(imageUrl)
                .brand(brand)
                .price(price)
                .setIsSecondHand(isSecondHand)
                .setProcessor(processor)
                .setRamSize(ramSize)
                .setStorageSize(storageSize)
                .setStorageType(storageType)
                .setGraphicsCard(graphicsCard)
                .setScreenSize(screenSize)
                .setResolution(resolution)
                .setOperatingSystem(operatingSystem)
                .setBatteryLife(batteryLife)
                .setWeight(weight)
                .setTouchscreen(isTouchscreen)
                .setKeyboardLayout(keyboardLayout)
                .setAmountOfUsbPorts(amountOfUsbPorts)
                .setHasHdmiPort(hasHdmiPort)
                .setHasWebcam(hasWebcam)
                .setRefurbished(isRefurbished)
                .build();
    }
}
