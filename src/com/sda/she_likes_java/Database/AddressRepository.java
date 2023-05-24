package com.sda.she_likes_java.Database;

import java.util.List;

public class AddressRepository {

    private static final String allAddressesQuery = """
            SELECT ID, CITY, STREET, POSTAL CODE, COUNTRY
            FROM ADDRESSES
            """;
    private static final String findAddressById = """
            SELECT ID, CITY, STREET, POSTAL CODE, COUNTRY
            FROM ADDRESSES
            WHERE ID = %d --place for id row
            """;
    private static final String findAddressesByCityAndCountry = """
            SELECT ID, CITY, STREET, POSTAL CODE, COUNTRY
            FROM ADDRESSES
            WHERE CITY = %S AND COUNTRY = %S
            """;

    public static List<Address> getAllUsers() {
        return List.of();
    }
}
