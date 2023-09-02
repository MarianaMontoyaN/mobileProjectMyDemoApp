Feature: Account creation
  As a user
  I want to buy some items
  To receive them at home

  Scenario: Successful purchase
    Given a user is logged in
    When the user select the items
      | Sauce Labs Backpack     |
      | Sauce Labs Bolt T-Shirt |
    And make the payment
    Then the purchase is successful