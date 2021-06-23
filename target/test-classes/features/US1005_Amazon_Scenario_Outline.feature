
Feature: US1005_Amazon Scenario Outline
  Scenario Outline: TC010_Amazon coklu arama
    Given kullanici amazon sayfasina gider
    Then "<fruit>" icin arama yapar
    And sonuclarin "<fruit>" icerdigini test eder

Examples:
|fruit|
    |graps|
    |watermelon|
    |avacado|
    |onion|
    |potato|
    |bread|
    |eggs|
