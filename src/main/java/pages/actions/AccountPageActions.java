package pages.actions;

import config.ConfigurationManager;
import pages.elements.AccountPage;
import utils.UIActions;


public class AccountPageActions {

    public static void openNewAdressPage() {
        UIActions.click(AccountPage.addressBook);
        UIActions.click(AccountPage.addNewAddress);
    }

    public static void enterAddressDetails() {
        UIActions.type(AccountPage.addressTitle, ConfigurationManager.getAddressTitle());
        UIActions.type(AccountPage.addressName, ConfigurationManager.getFirstName());
        UIActions.type(AccountPage.addressSurname, ConfigurationManager.getSurname());
        UIActions.click(AccountPage.countryDropdown);
        UIActions.click(AccountPage.selectCountry);
        UIActions.click(AccountPage.cityDropdown);
        UIActions.selectItemFromList(AccountPage.selectCity,ConfigurationManager.getLocation());
        UIActions.click(AccountPage.stateDropdown);
        UIActions.selectItemFromList(AccountPage.selectState,ConfigurationManager.getTown());
        UIActions.type(AccountPage.addressPhone, ConfigurationManager.getPhoneNumber());
        UIActions.type(AccountPage.tcNumber, ConfigurationManager.getTCId());
        UIActions.type(AccountPage.addressArea, ConfigurationManager.getAddress());
    }

    public static void saveAddress() {
        UIActions.click(AccountPage.saveButton);
    }

    public static boolean isAddressCreated() {
        return UIActions.checkItemExist(AccountPage.getAddressTitleText,ConfigurationManager.getAddressTitle());
    }


}


