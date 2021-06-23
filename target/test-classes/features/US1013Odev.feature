Feature: US1013_Kullanici Data
  @dip
  Scenario: TC13 DataTableStepDefinition dosyasi ve gerekli step definition'lari olusturun
    Given kullanici "editor_datatables_url" sayfasina gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And sayfayi kapatir
