Feature: Logout Functionality

  Scenario: Verificar logout
    Given el usuario está autenticado en la aplicación
    When el usuario hace logout desde la aplicación
    Then el usuario es redirigido a la página de login