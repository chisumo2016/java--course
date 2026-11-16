package packages.demo.service;

import java.util.UUID;

//This is default , visible only within the package
class AccountInternalService {
    public String generateAccountID() {
        return UUID.randomUUID().toString();
    }
}
