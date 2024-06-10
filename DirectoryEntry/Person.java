package DirectoryEntry;

import java.io.*;
import java.util.*;

class DirectoryEntry {
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;

    public DirectoryEntry(String name, String address, String telephone, String mobile, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void printEntry() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + telephone);
        System.out.println("Mobile: " + mobile);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println();
    }
}

class DirectoryManager {
    private Map<String, DirectoryEntry> directory;

    public DirectoryManager() {
        directory = new HashMap<>();
    }

    public void createEntry(String uniqueId, String name, String address, String telephone, String mobile, String headOfFamily) {
        if (directory.containsKey(uniqueId)) {
            System.out.println("Error: Unique ID already exists. Please choose a different ID.");
            return;
        }

        for (DirectoryEntry entry : directory.values()) {
            if (entry.getHeadOfFamily().equals(headOfFamily) && entry.getTelephone().equals(telephone)) {
                System.out.println("Error: Telephone number already exists for another entry with the same head of family.");
                return;
            }
        }

        directory.put(uniqueId, new DirectoryEntry(name, address, telephone, mobile, headOfFamily));
        System.out.println("Entry created successfully.");
    }

    public void editEntry(String uniqueId, String name, String address, String telephone, String mobile, String headOfFamily) {
        if (!directory.containsKey(uniqueId)) {
            System.out.println("Error: Unique ID not found.");
            return;
        }

        DirectoryEntry entry = directory.get(uniqueId);
        entry.printEntry();

        if (!name.isEmpty()) {
            entry = new DirectoryEntry(name, address, telephone, mobile, headOfFamily);
            directory.put(uniqueId, entry);
        }

        System.out.println("Entry updated successfully.");
    }

    public void printDirectory() {
        for (DirectoryEntry entry : directory.values()) {
            entry.printEntry();
        }
    }
}
