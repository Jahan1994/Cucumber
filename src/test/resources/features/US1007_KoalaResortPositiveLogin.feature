
@koalaResortPozitifLogin
Feature: US1007_KoalaResortPositiveLogin.feature
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "kr_url" Hotels ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir
