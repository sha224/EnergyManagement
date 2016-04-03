/*
 * Copyright (C) 2016 Shakhar Dasgupta <sdasgupt@oswego.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package csc241hw07;

import java.util.ArrayList;

/**
 *
 * @author Shakhar Dasgupta <sdasgupt@oswego.edu>
 */
class Customer {

    private String lastName;
    private String firstName;
    private Address mailingAddress;
    private ArrayList<Account> accounts;

    public Customer(String lastName, String firstName, Address mailingAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mailingAddress = mailingAddress;
        accounts = new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public Account[] getAccounts() {
        return accounts.toArray(new Account[accounts.size()]);
    }

    public boolean addAccount(Account a) {
        return accounts.add(a);
    }

    public boolean removeAccount(Account a) {
        return accounts.remove(a);
    }
}