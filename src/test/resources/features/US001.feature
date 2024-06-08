#http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
#Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
#Tüm yapılacakların üzerini çiz.
#Tüm yapılacakları sil.
#Tüm yapılacakların silindiğini doğrulayın.

@US001
Feature: US001 Todo list

  Scenario:
    Given go to the url
    When add to the todo list
      | Kahvaltıyı hazırla          |
      | Bulaşıkları yıka            |
      | Bebekle ilgilen             |
      | Çocuğunun ödevine yardım et |
      | Selenyum çalış              |
      | Uyu                         |
    And cross off all todo items
    And delete all todo items
    Then verify that all todo items have been deleted
    And close the browser




