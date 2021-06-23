@rapor2
Feature: US1004_Amazon Parameterized

Background: Amazon sayfasina gitme
  Given kullanici amazon sayfasina gider

  Scenario: TC07_Amazon iPhone arama parametrli
    Then  "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder

    Scenario: TC08_Amazon tea pot arama parametrli
      Then "tea pot" icin arama yapar
      Then sonuclarin "tea pot" icerdigini test eder

      Scenario: TC09_Amazon flower arama parametrli
        Then "flower" icin arama yapar
        Then sonuclarin "flower" icerdigini test eder
        And sayfayi kapatir