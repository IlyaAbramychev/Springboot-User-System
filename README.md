# Springboot-User-System
Демонстрационное Spring Boot API-приложение для управления пользователями с использованием H2 базы данных. Поддерживает базовые CRUD-операции и фильтрацию по стране.

## Описание
Это RESTful веб-приложение для управления пользователями, разработанное на Spring Boot. Приложение предоставляет API для создания, получения и фильтрации пользователей.

## Технологии
- Java 17
- Spring Boot 3.1.5
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Maven

## Структура проекта
```
src/
├── main/
│   ├── java/
│   │   └── com/example/usersystem/
│   │       ├── controller/     # REST контроллеры
│   │       ├── entity/         # JPA сущности
│   │       ├── enums/          # Enum классы
│   │       ├── repository/     # Data Access Layer
│   │       └── service/        # Business Logic Layer
│   └── resources/
│       ├── application.properties  # Конфигурация приложения
│       └── data.sql               # Инициализация данных
```

## API Endpoints

### 1. Получить всех пользователей
**GET** `/user-api/v1/users`

Возвращает список всех пользователей.

### 2. Добавить нового пользователя
**POST** `/user-api/v1/users`

Создает нового пользователя.

Пример запроса:
```json
{
  "firstName": "Ivan",
  "age": 25,
  "country": "FRANCE"
}
```

### 3. Получить пользователей не из указанной страны
**GET** `/user-api/v1/additional-info?country={COUNTRY}`

Возвращает пользователей не из указанной страны, отсортированных по возрасту.

Пример: `GET /user-api/v1/additional-info?country=RUSSIA`

## Доступные страны
- RUSSIA
- FRANCE
- GERMANY
- ITALY
- SPAIN
- UNITED_KINGDOM
- UNITED_STATES
- JAPAN
- CHINA
- CANADA

## Запуск приложения

### Предварительные требования
- Java 17 или выше
- Maven 3.6 или выше

### Инструкции по запуску
1. Склонируйте репозиторий
2. Перейдите в директорию проекта
3. Выполните команду:
   ```bash
   mvn spring-boot:run
   ```
4. Приложение будет доступно по адресу: `http://localhost:8080`

### H2 Database Console
После запуска приложения вы можете получить доступ к H2 Database Console:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## Тестирование
Для тестирования API можно использовать:
- Postman
- Insomnia
- HTTP-клиент в IntelliJ IDEA
- curl

## Примеры использования

### Получить всех пользователей
```bash
curl -X GET http://localhost:8080/user-api/v1/users
```

### Добавить нового пользователя
```bash
curl -X POST http://localhost:8080/user-api/v1/users \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "Ivan",
    "age": 25,
    "country": "FRANCE"
  }'
```

### Получить пользователей не из России
```bash
curl -X GET "http://localhost:8080/user-api/v1/additional-info?country=RUSSIA"
```
