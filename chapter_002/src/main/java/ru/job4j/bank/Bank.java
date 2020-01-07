package ru.job4j.bank;

import java.util.*;

public class Bank {
    private Map<User, List<Account>> clients = new HashMap<>();

    public void addUser(User user) {
        clients.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        clients.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        List<Account> accounts = getUserAccounts(passport);
        int indexAccount = accounts.indexOf(account);
        if (indexAccount < 0) {
            accounts.add(account);
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        getUserAccounts(passport).remove(account);
    }

    public List<Account> getUserAccounts(String passport) {
        return clients.entrySet().stream()
                .filter(e -> e.getKey().getPassport().equals(passport))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(new ArrayList<>());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean result = false;
        List<Account> srcAccounts = getUserAccounts(srcPassport);
        Account srcAccount = srcAccounts.get(srcAccounts.indexOf(new Account(srcRequisite)));
        List<Account> destAccounts = getUserAccounts(destPassport);
        Account destAccount = destAccounts.get(destAccounts.indexOf(new Account(destRequisite)));
        if (amount > 0 && srcAccount.getValue() >= amount) {
            srcAccount.setValue(srcAccount.getValue() - amount);
            destAccount.setValue(destAccount.getValue() + amount);
            result = true;
        }
        return result;
    }
    private Account getUserAccount(String passport, String requisite) {
        return getUserAccounts(passport).stream()
                .filter(acc -> acc.getRequisites().equals(requisite))
                .findFirst()
                .orElse(null);
    }
}