@LoginProfile
Feature: Тестируем страницу авторизации
  Бла-бла-бла

  Scenario Outline: Неудачная авторизация
    Given Я нахожусь на домашней странице
    Then Я нажимаю ссылку signIn
    When Ввожу логин '<логин>'
    And Ввожу пароль '<пароль>'
    And нажимаю отправить
    Then должен увидеть сообщение об ошибке '<сообщение>'

    Examples:
      | логин                         | пароль              | сообщение                 |
      | natalia.oleynik10@gmail.com   |123123123            |Authentication failed.     |
      | nata@test.com                 |123qwerty            |Authentication failed.     |
      | nata@test.com                 |123qwerty            |Authentication failed.     |
      | nata@test.com                 |                     |Password is required.      |
      |                               |123qwerty            |An email address required. |
      |                               |                     |An email address required. |