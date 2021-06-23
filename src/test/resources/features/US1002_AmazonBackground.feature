@rapor2
Feature:U1002_Amazon Bacground Kullanma
  Background:Sayfayi acma
    Given kullanici amazon sayfasina gider

    @ali @veli
  Scenario: TC01_Amazon Arama Yapma
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder
@smoke @miniregrission
    Scenario: TC02_Amazon Arama Yapma
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
@smoke
      Scenario: TC03_Amazon Arama Yapma
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir
