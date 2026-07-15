package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     *
     * @param customerDto Object
     */
    void createAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber
     * @return Account Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicating if the updated Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);

}
