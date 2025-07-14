# Быстрый старт

## Что в этом проекте

✅ **Полностью функциональное Spring Boot приложение для управления пользователями**

### Реализованы все требования ТЗ:

#### 🎯 Функциональные требования:
- ✅ **GET** `/user-api/v1/users` - получение всех пользователей
- ✅ **POST** `/user-api/v1/users` - добавление нового пользователя
- ✅ **GET** `/user-api/v1/additional-info?country={COUNTRY}` - фильтрация по стране (НЕ из указанной страны, сортировка по возрасту)

#### 🏗️ Нефункциональные требования:
- ✅ **Многослойная архитектура**: Controller → Service → Repository
- ✅ **Сущность User**: id (Long), firstName (String), age (Integer), country (Country)
- ✅ **Enum Country**: 10 стран на выбор
- ✅ **H2 in-memory database** с консолью для отладки
- ✅ **Инициализация БД** с 10 тестовыми пользователями
- ✅ **Только Spring Data JPA** (без прямых SQL-запросов)

## Структура проекта
```
Springboot-User-System-main/
├── src/
│   ├── main/
│   │   ├── java/com/example/usersystem/
│   │   │   ├── controller/UserController.java    # REST API
│   │   │   ├── service/UserService.java          # Бизнес-логика
│   │   │   ├── repository/UserRepository.java    # Доступ к данным
│   │   │   ├── entity/User.java                  # JPA сущность
│   │   │   ├── enums/Country.java                # Enum стран
│   │   │   └── UserSystemApplication.java        # Главный класс
│   │   └── resources/
│   │       ├── application.properties            # Конфигурация
│   │       └── data.sql                          # Тестовые данные
├── pom.xml                                       # Maven зависимости
├── README.md                                     # Полная документация
├── INSTALL.md                                    # Инструкции по установке
├── api-tests.http                                # Тестовые HTTP-запросы
└── run.bat                                       # Скрипт запуска
```

## Как запустить

### 1. Установите Java и Maven
Читайте [`INSTALL.md`](INSTALL.md) для подробных инструкций

### 2. Запустите приложение
```bash
# Вариант 1: Используйте батник
run.bat

# Вариант 2: Команда Maven
mvn spring-boot:run

# Вариант 3: Создайте JAR
mvn clean package
java -jar target/user-system-1.0.0.jar
```

### 3. Проверьте работу
- **API доступно**: http://localhost:8080/user-api/v1/users
- **H2 Console**: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:testdb`
  - User: `sa`
  - Password: `password`

## Как тестировать

### Способ 1: Готовые HTTP-запросы
Откройте файл [`api-tests.http`](api-tests.http) в IntelliJ IDEA или VS Code

### Способ 2: curl (в PowerShell)
```bash
# Получить всех пользователей
curl http://localhost:8080/user-api/v1/users

# Добавить пользователя
curl -X POST http://localhost:8080/user-api/v1/users -H "Content-Type: application/json" -d '{"firstName":"Test","age":25,"country":"FRANCE"}'

# Получить пользователей НЕ из России
curl "http://localhost:8080/user-api/v1/additional-info?country=RUSSIA"
```

### Способ 3: Postman
Импортируйте запросы из файла `api-tests.http`

## Доступные страны
`RUSSIA`, `FRANCE`, `GERMANY`, `ITALY`, `SPAIN`, `UNITED_KINGDOM`, `UNITED_STATES`, `JAPAN`, `CHINA`, `CANADA`

## Что дальше?

🔧 **Для разработки**:
- Откройте проект в IntelliJ IDEA или Eclipse
- Все зависимости автоматически скачаются
- Запустите `UserSystemApplication.main()`

📚 **Для изучения**:
- Посмотрите на многослойную архитектуру
- Изучите JPA Query в `UserRepository`
- Проверьте работу с H2 Console

🚀 **Готово к демонстрации**:
- Приложение полностью соответствует ТЗ
- Все эндпоинты работают
- База данных инициализирована тестовыми данными 