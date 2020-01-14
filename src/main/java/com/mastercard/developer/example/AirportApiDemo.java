/*
 *  Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * 
 * Loyalty Airport Experience API
 * The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.example;

import java.util.ArrayList;
import java.util.List;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.loyalty_airport_client.ApiClient;
import com.mastercard.developer.loyalty_airport_client.ApiException;
import com.mastercard.developer.loyalty_airport_client.api.AirportApi;
import com.mastercard.developer.loyalty_airport_client.api.BundleProfileApi;
import com.mastercard.developer.loyalty_airport_client.model.Account;
import com.mastercard.developer.loyalty_airport_client.model.AccountExternal;
import com.mastercard.developer.loyalty_airport_client.model.Address;
import com.mastercard.developer.loyalty_airport_client.model.BundleUser;
import com.mastercard.developer.loyalty_airport_client.model.BundleUserData;
import com.mastercard.developer.loyalty_airport_client.model.BundleUserResponse;
import com.mastercard.developer.loyalty_airport_client.model.Consent;
import com.mastercard.developer.loyalty_airport_client.model.Credentials;
import com.mastercard.developer.loyalty_airport_client.model.Email;
import com.mastercard.developer.loyalty_airport_client.model.Identification;
import com.mastercard.developer.loyalty_airport_client.model.Im;
import com.mastercard.developer.loyalty_airport_client.model.LoungeAirport;
import com.mastercard.developer.loyalty_airport_client.model.LoungeDMC;
import com.mastercard.developer.loyalty_airport_client.model.LoungeDetail;
import com.mastercard.developer.loyalty_airport_client.model.LoungeEntitlement;
import com.mastercard.developer.loyalty_airport_client.model.LoungeHistoryItem;
import com.mastercard.developer.loyalty_airport_client.model.Name;
import com.mastercard.developer.loyalty_airport_client.model.PhoneNumber;
import com.mastercard.developer.loyalty_airport_client.model.Photo;
import com.mastercard.developer.loyalty_airport_client.model.User;
import com.mastercard.developer.loyalty_airport_client.model.UserProduct;

public class AirportApiDemo {
	
	 public static void main(String[] args) throws Exception {
		 
		 RequestHelper.loadProperties();
		 
		 ApiClient apiClient = new ApiClient();
		 apiClient.setBasePath(RequestHelper.getBaseURL());
		 apiClient.getHttpClient().interceptors().add(new OkHttp2OAuth1Interceptor(RequestHelper.getConsumerkey(),RequestHelper.getPrivateKey()));
		 apiClient.setDebugging(true);
	        
	     AirportApi airportApi = new AirportApi(apiClient);
	    
		if (runThisScenario(args, "registration")) {
			BundleProfileApi bundleProfileApi = new BundleProfileApi(apiClient);
			executeRegistrationScenario(bundleProfileApi);
		}

		if (runThisScenario(args, "lounges")) {
			executeLoungesScenario(airportApi);
		}

		if (runThisScenario(args, "loungeDetails")) {
			executeLoungeDetailsScenario(airportApi);
		}

		if (runThisScenario(args, "dmc")) {
			executeDMCScenario(airportApi);
		}

		if (runThisScenario(args, "entitlement")) {
			executeEntitlementsScenario(airportApi);
		}

		if (runThisScenario(args, "loungeHistory")) {
			executeHistoryScenario(airportApi);
		}

		if (runThisScenario(args, "error")) {
			executeErrorScenario(airportApi);
		}
	    }
	 
	 
	private static void executeRegistrationScenario(BundleProfileApi bundleProfileApi) {
		 BundleUser bundleUser = getRegistrationObject();
		 try {
			 printMessage("STARTING AIRPORT REGISTRATION FROM COMMAND LINE RUNNER");
			 BundleUserResponse result = bundleProfileApi.createUser(bundleUser);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
			} catch (Exception e) {
				System.err.println("Exception when calling Registration");
				e.printStackTrace();
			}
	}

	private static void executeLoungesScenario(AirportApi airportApi) {
		String userId = "testRemediatedLDE0803";
		String panLastFourDigits = "0803";
		String searchText = "lon";
		String preferredLanguage = "en-GB";
		try {
			 printMessage("STARTING GET AIRPORT LOUNGES FROM COMMAND LINE RUNNER");
			List<LoungeAirport> result = airportApi.loyaltyAirportLoungesGet(userId, panLastFourDigits, searchText,
					preferredLanguage);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Lounges");
			e.printStackTrace();
		}
	}

	private static void executeLoungeDetailsScenario(AirportApi airportApi) {
		String loungeCode = "LHR13";
		String userId = "testRemediatedLDE0803";
		String panLastFourDigits = "0803";
		String preferredLanguage = "en-GB";
		try {
			printMessage("STARTING GET AIRPORT LOUNGE DETAILS FROM COMMAND LINE RUNNER");
			LoungeDetail result = airportApi.loyaltyAirportLoungesLoungeCodeGet(loungeCode, userId, panLastFourDigits,
					preferredLanguage);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Lounge Details");
			e.printStackTrace();
		}
	}

	private static void executeDMCScenario(AirportApi airportApi) {
		String userId = "testRemediatedLDE0803"; 
		String panLastFourDigits = "0803"; 
		try {
			printMessage("STARTING GET AIRPORT DMC FROM COMMAND LINE RUNNER");
			LoungeDMC result = airportApi.loyaltyAirportDigitalMembershipCardsGet(userId, panLastFourDigits);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling Digital Membership card");
			e.printStackTrace();
		}
	}

	private static void executeEntitlementsScenario(AirportApi airportApi) {
		String userId = "testRemediatedLDE0803";
		String panLastFourDigits = "0803";
		try {
			printMessage("STARTING GET ENTITLEMENT FROM COMMAND LINE RUNNER");
			List<LoungeEntitlement> result = airportApi.loyaltyAirportEntitlementsGet(userId, panLastFourDigits);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling entitlements");
			e.printStackTrace();
		}
	}

	private static void executeHistoryScenario(AirportApi airportApi) {
		String userId = "testRemediatedLDE0803";
		String panLastFourDigits = "0803";
		String preferredLanguage = "en-GB";
		try {
			printMessage("STARTING GET LOUNGE HISTORY FROM COMMAND LINE RUNNER");
			List<LoungeHistoryItem> result = airportApi.loyaltyAirportVisitsGet(userId, panLastFourDigits,
					preferredLanguage, null, null);
			 System.out.println("Parsed Response---------------");
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Exception when calling lounge history");
			e.printStackTrace();
		}
	}
	
	private static void executeErrorScenario(AirportApi airportApi) {
		String userId = "0UcSwZBQX4";
		String panLastFourDigits = "UiCKNs6fr7NiD";
		String searchText = "NDzc7y";
		String preferredLanguage = "XNqfPv70B1f6";
		try {
			printMessage("STARTING GET AIRPORT LOUNGES ERROR SCENARIO FROM COMMAND LINE RUNNER");
			airportApi.loyaltyAirportLoungesGet(userId, panLastFourDigits, searchText,
					preferredLanguage);
		} catch (ApiException e) {
			System.err.println("Exception when calling AirportApi Lounges");
		}
	}
	
	private static void printMessage(String scenario) {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(scenario+"---------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
	}
	
	
	private static BundleUser getRegistrationObject() {
		BundleUser bundleUser = new BundleUser();
		BundleUserData bundleUserData = new BundleUserData();
		User user = new User();
		UserProduct userProduct = new UserProduct();
		Address address = new Address();
		Email email = new Email();
		Identification identification = new Identification();
		Im im = new Im();
		Name name = new Name();
		PhoneNumber phoneNumber = new PhoneNumber();
		Photo photo = new Photo();
		List<Photo> photos = new ArrayList<>();
		List<PhoneNumber> phoneNumbers = new ArrayList<>();
		List<Im> ims = new ArrayList<>();
		List<Identification> identifications = new ArrayList<>();
		List<Email> emails = new ArrayList<>();
		List<Address> addresses = new ArrayList<>();
		
		
		user.setActive(true);
		address.setCountry("US");
		address.setFormatted("114 5th Ave, New York, NY 10011");
		address.setLocality("city");
		address.setOperation("None");
		address.setPostalCode("10011");
		address.setPrimary(false);
		address.setRegion("NY");
		address.setStreetAddress("114 5th Ave");
		address.setStreetAddress2("Suite 20");
		address.setType("work");
		addresses.add(address);
		user.setAddresses(addresses);
		
		user.setDateOfBirth("1992-11-17");
		user.setDisplayName("John F Smith");
		
		email.setDisplay("Primary email address of user");
		email.setOperation("None");
		email.setPrimary(true);
		email.setType("home");
		email.setValue("john5033379289074369@gmail.com");
		emails.add(email);
		user.setEmails(emails);
		
		user.setExternalId("user123-partnerBank");
		user.setId("d3459481-fb1c-48bb-8685-40eb629e2ae1");
		
		identification.setCountry("BR");
		identification.setType("CPF");
		identification.setValue("496881234");
		identifications.add(identification);
		user.setIdentifications(identifications);
		
		im.setDisplay("user Yahoo-id");
		im.setOperation("None");
		im.setPrimary(true);
		im.setType("aim");
		im.setValue("JohnFSmith123");
		ims.add(im);
		user.setIms(ims);
		
		user.locale("en-US");
		
		name.setFamilyName("Smitherines");
		name.setFormatted("Sally Smitherines");
		name.setGivenName("Sally");
		name.setHonorificPrefix("Ms.");
		name.setHonorificSuffix("Sr.");
		name.setMiddleName("F");
		user.setName(name);
		
		user.setNickName("sallySmith");
		user.setPassword("boingouser5105363487498185");
		
		phoneNumber.setDisplay("Office fax of user");
		phoneNumber.setOperation("None");
		phoneNumber.setPrimary(false);
		phoneNumber.setType("fax");
		phoneNumber.setValue("+1-201-555-0123");
		phoneNumbers.add(phoneNumber);
		user.setPhoneNumbers(phoneNumbers);
		
		photo.setDisplay("portrait");
		photo.setOperation("None");
		photo.setPrimary(true);
		photo.setType("thumbnail");
		photo.setValue("facebook.com/JohnFSmith123/photos/1");
		photos.add(photo);
		user.setPhotos(photos);
		
		user.setPreferredLanguage("en");
		user.setProfileUrl("facebook.com/JohnFSmith123");
		user.setTimezone("America/New_York");
		user.setTitle("Vice President");
		user.setUserId("user123-partnerBank");
		user.setUserName("JohnFSmith123");
		user.setUserType("Intern");
		
		Account account=new Account();
        account.setAccountType("SingleMember");
        account.setBrand("Mastercard");
        account.setCardAlias("d3459481-fb1c-48bb-8685-40eb629e2ae1");
        account.setCardExpiryDate("02/2024");
        account.setCvcCode("876");
        account.setIca(12594L);
        account.setLast4Pan(8185);
        account.setNameOnCard("SALLY SMITHERINES");
         account.setPan("5105363487498185");
        account.setPar("q1hjz28rka1ebl470g9xyg90r5d3e");
        account.setPrimary(true);
        account.setProductLine("Credit cards");
        account.setProductType("Black");
        account.setUuid("d3459481-fb1c-48bb-8685-40eb629e2ae1");
        
        AccountExternal accountExternal = new AccountExternal();
        accountExternal.setAccountStatusCode("1");
        accountExternal.setExternalMembershipReferenceId("B12345");
        account.setObject(accountExternal);
        
        Consent consent=new Consent();
        consent.setAgreed(true);
        consent.setConsentType("author-legal-content-document");
        consent.setConsentedDate("2018-06-19T12:30:42.307+0000");
        consent.setCountry("BRA");
        consent.setLanguage("en_us");
        consent.setServiceCode("priceless");
        consent.setServiceFunctionCode("registration-page code");
        consent.setUseCategoryCode("UC-01");
        consent.setUseCategoryValue("acceptPersonalizedOffersEmail");
        consent.setUuid("d3459481-fb1c-48bb-8685-40eb629e2ae1");
        
        List<Account> accounts=new ArrayList<>();
        accounts.add(account);
        List<Consent> consents=new ArrayList<>();
        consents.add(consent);
        Credentials productCredentials=new Credentials();
        productCredentials.setUsername("boingoid123");
        productCredentials.setPassword("boingopwd");
        userProduct.setProduct("airport");
        userProduct.setAccounts(accounts);
        userProduct.setConsents(consents);
        userProduct.setObject(productCredentials);
        List<UserProduct> products = new ArrayList<>();
        products.add(userProduct);

        bundleUserData.setProducts(products);
        bundleUserData.setUser(user);
        bundleUser.setData(bundleUserData);
		
        return bundleUser;
		
	}
	
	private static boolean runThisScenario(String[] args, String scenario) {
		return (args!=null && args.length>0 && args[0].contains(scenario)) || (args == null || args.length == 0);
	}


}