@all
Feature: ozon buying
@books
  Scenario:Buying a book
    When open ozon market
    And cookie is closed
    And choose city "Ижевск"
    And catalog is opened
    And books is chosen
    And computer technologies are chosen
    And bestsellers checked
    And software languages checked
    And random good is chosen
    And cart button is pressed
    And to cart button is vanished
    And cart is opened
    And good in cart is found
    Then check if goods are equal
@snowboards
  Scenario:
    When open ozon market
    And cookie is closed
    And choose city "Ижевск"
    And catalog is opened
    And sports goods are chosen
    And snowboards and accessories are chosen
    And snowboards are chosen
    And price is set to "25000"
    And for advanced is checked
    And random good is chosen
    And cart button is pressed
    And to cart button is vanished
    And cart is opened
    And good in cart is found
    Then check if goods are equal