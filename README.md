# Test-Automation---GUI-Test

Selenium based automated test written in Java using the TestNG framework. It simulates the process of registering a new user on the Guru99 demo website by opening the Chrome browser  navigating to the registration page via the "REGISTER" link  and filling out the form with sample user data including first name, last name, phone number, email, username  and password. It demonstrates interaction with various web elements such as text fields and dropdowns selecting a country using different methods (visible text, value and index). After submitting the form it verifies successful registration by checking the presence of a confirmation message that includes the user's name. Finally the browser is closed completing the automated test flow.

The RegisterUserTest1 class automates the following steps using Selenium

1) Launches Chrome browser and navigates to the Guru99 demo site.
2) Clicks the "REGISTER" link on the homepage.
3) Fills in the registration form with test user data (first name, last name, phone, email, username, password).
4) Selects a country from the dropdown (demonstrates three selection methods: by visible text, value, and index).
5) Submits the form.
6) Verifies that the registration was successful using an assertion on the salutation message.
7) Closes the browser.
