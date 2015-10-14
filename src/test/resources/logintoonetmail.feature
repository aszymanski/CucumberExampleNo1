Feature: Login to Onet mail box
    Onet home page should be opened
    There is no logged user

  Scenario: Open login form
    Given  Onet page is opened

    When I press Poczta button
    Then Page with login form is opened


