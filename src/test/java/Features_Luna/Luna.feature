Feature: Patient Information



  Scenario: Providing Patient Information
    Given a patient wants to provide their information
    When User enter their first name as "Auto"
    And User enter their last name as "Mation"
    And User enter their date of birth as "02/09/1990"
    And User enter their mobile number as "8238932567"
    And User enter their email as "test.123@yahoo.com"
    And User click the Next button
    And the system should capture the patient information successfully
    And User search for the address
    And User choose the treatment type
    And User select Insurance type
    And User click the Primary policyholder Radio button
    And User select the gender
    And User Enter the policy number
    And User Enter the Group ID
    And User select the Insurance Card Image (Front)
    And User select the Insurance Card Image (Back)
    And User click the radio button of I agree to the Terms and Conditions
    And User finishing the page and click the Next button
