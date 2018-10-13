package com.orange.wc;

import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WcApplicationTests {

	@Test
	public void contextLoads() {

		Gson gson=new Gson();
		String aa="{customer={addresses=[{addressLine1=null, addressLine2=null, addressLine3=null, addressLine4=null, addressLine5=null, addressType=R, alternateContact=null, alternateContactType=null, cityCode=150100, clientRelation=null, countryCode=CHN, countyCode=150102, customerAddrId=null, customerId=1000101203, email=678@qq.com, fullAddress=uuu, mobileNumber=13866724428, provinceCode=150000, systemIds=null, zipCode=278838}, {addressLine1=null, addressLine2=null, addressLine3=null, addressLine4=null, addressLine5=null, addressType=B, alternateContact=null, alternateContactType=null, cityCode=150100, clientRelation=null, countryCode=CHN, countyCode=150102, customerAddrId=null, customerId=1000101203, email=, fullAddress=呃呃呃, mobileNumber=null, provinceCode=150000, systemIds=null, zipCode=445667}], agent=null, alternateContact=null, alternateContactType=null, amlRatings=null, amlReportStatus=null, amla=00, annualIncome=12, familyAnnualIncome=23, bankruptind=null, birthCountry=CHN, birthDate=1958-03-14, birthPlace=null, birthPlaceCode=null, blackListReason=null, businessRegNo=null, businessRegType=null, capital=null, category=null, censusRegister=null, clientType=P, companyContact=null, companyIndustry=null, companyName=null, companyName2=null, companyName3=null, countryCode=null, crsInfos=null, customerId=1000101203, dateOfWork=null, directmail=null, docNo=null, drivingLicenseCode=null, drivingLicenseNo=null, educationCode=null, fao=null, fatca=null, favourSet=null, faxNumber=null, firstName=null, fpmsClientNumber=null, fullName=卡高啊四, gender=F, householdBookletRegPlace1=null, householdBookletRegPlace2=null, householdBookletRegPlace3=null, idExpiryDate=2099-01-01, idIssueDate=null, identityNo=110101196704110037, identityType=111, inception=null, issueCountry=null, issuePlace=null, jobPosition=null, joinDate=null, language=null, lastName=null, legalRep=null, licenseNum=null, mailing=null, maritalStatus=M, marriageDate=null, middleName=null, mobileNumber=null, nameFormat=null, natOfChina=null, nationality=CHN, nationality2=null, nationality3=null, occupationCode=0001, oldIdNo=null, originCountry=null, phoneNumber1=null, phoneNumber2=null, preferName=null, preferName2=null, preferName3=null, regCountry=null, regPlace=null, socialInsurance=null, sourceOfEvidence=null, staffFlag=null, staffNo=null, status=null, taxFlag=null, taxId=null, title=MS, vip=null, workingStatus=null, workingTime=null}, customerId=1000101203, disablePartialUpdate=N, systemClientId=0000001V}";
		System.out.println(gson.toJson(aa).toString());
	}

}
