@wip
Feature: US1011_Amazon Arama
  Scenario: TC15_Kullanici Amazonda Mehmet aratir
    Given kullanici "amazon_url" sayfasina gider
    Then kullanci Todays deals e tiklar
    And Todays deals sayfasinda "Mehmet" icin arama yapar
   Then  ilk ilan isminde "Mehmet" gectiyini test eder
