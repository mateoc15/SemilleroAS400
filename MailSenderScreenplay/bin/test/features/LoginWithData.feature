@tag
Feature: Login With Data
  I want to log in gmail with a mail account and the password

  @SmokeTest
  Scenario Outline: Login on gmail
    Given we visit the gmail plogin page
    When we put the credentials "<user>" and "<pass>"
    Then we click and we reach the home page with the list of received mails.

    Examples: 
      | user                    | pass        |
      | mateo.canober@gmail.com | canoteo0987 |
