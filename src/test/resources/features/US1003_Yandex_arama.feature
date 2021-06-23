
Feature: US1003 Open the Yandex page
  Background: : User use navigate for going Yandex
    Given User use navigate for going Yandex

    Scenario: TC05_iPhone search
      When User search for iPhone in Yandex
      Then User verify result has a iPhone

      Scenario: TC06_Teapot search
        When User search for Teapot in Yandex
        Then User verify result has a Teapot
And User close the window
# 1- feature dosyasi olusturup, insan olarak yapacagim adimlari yaziyorum
# 2- Eksik step definition'lari elde etmek icin, testimizi calistiriyoruz
    # eger Feature dosyasindan calistirirsak calisan adimlari run eder ve eksik kalan adimlari bize verir
    # eger varolan adimlari calistirmadan direk eksik stepleri versin istiyorsak
    # runner'a gidip dryRun'i true yapariz, eksik stepleri aldiktan sonra yeniden false yapariz
# 3- eksik step'leri kopyalayip, stepDefinition class'ina yapistiririz
# 4- stepleri calistiracak Java kodlarimizi method'larin icine yazariz
# 5- Locate ihtiyacimiz olursa page class'i olusturur, gerekli locate'leri yapariz
      # step definition class'inda birden fazla method'da page objesini kullanacagim icin
      # page objesini class level'da (instance) olustururum

