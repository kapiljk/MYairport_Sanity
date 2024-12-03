Feature: BKI KCH PEN Welcome Page functionality

@BKP
Scenario: Verify Functionality of Submit button after selecting the terminal BKI in prelogin page
When the user clicks on select terminal dropdown and choose BKI-KotaKinabalu in the Prelogin Page
And the user clicks on Submit button on the Prelogin Page
Then  verifies that the user lands on the welcome page
And the user clicks on BAHASA MALAYSIA in the welcome Page
Then verifies that the app language changes in malaysia language
And the user clicks on CHINESE in the welcome Page
Then verifies that the app language changes in Chinese language
And the user clicks on ENGLISH in the welcome Page
Then verifies that the app language changes in English language
And the user clicks on the Submit button on the welcome Page
Then the user lands on the Login Page

@BKP
Scenario: Verify Functionality of Submit button after selecting the terminal KCH in prelogin page
When the user clicks on select terminal dropdown and choose KCH-Kutching in the Prelogin Page
And the user clicks on Submit button on the Prelogin Page
Then  verifies that the user lands on the welcome page
And the user clicks on BAHASA MALAYSIA in the welcome Page
Then verifies that the app language changes in malaysia language
And the user clicks on CHINESE in the welcome Page
Then verifies that the app language changes in Chinese language
And the user clicks on ENGLISH in the welcome Page
Then verifies that the app language changes in English language
And the user clicks on the Submit button on the welcome Page
Then the user lands on the Login Page

@BKP
Scenario: Verify Functionality of Submit button after selecting the terminal PEN in prelogin page
When the user clicks on select terminal dropdown and choose PEN-Penang in the Prelogin Page
And the user clicks on Submit button on the Prelogin Page
Then  verifies that the user lands on the welcome page
And the user clicks on BAHASA MALAYSIA in the welcome Page
Then verifies that the app language changes in malaysia language
And the user clicks on CHINESE in the welcome Page
Then verifies that the app language changes in Chinese language
And the user clicks on ENGLISH in the welcome Page
Then verifies that the app language changes in English language
And the user clicks on the Submit button on the welcome Page
Then the user lands on the Login Page