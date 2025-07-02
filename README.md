# Springboot-User-System

Небольшое REST API-приложение на Spring Boot для управления пользователями с использованием базы данных H2 и Spring Data JPA.

## Запуск

```bash
mvn spring-boot:run
```

После запуска будет доступна [консоль H2](http://localhost:8080/h2-console).

## Основные эндпоинты

- `GET /users` — получить список всех пользователей;
- `POST /users` — добавить пользователя (JSON с полями `name`, `age`, `country`);
- `GET /users/search?country={country}` — получить пользователей не из указанной страны, отсортированных по возрасту.
