# Инструкции по установке и запуску

## Предварительные требования

Для запуска данного Spring Boot приложения вам потребуется установить:

### 1. Java Development Kit (JDK) 17 или выше

#### Установка через OpenJDK:
1. Перейдите на https://adoptium.net/
2. Выберите JDK 17 для Windows
3. Скачайте и установите JDK
4. Добавьте Java в PATH:
   - Откройте "Система" → "Дополнительные параметры системы"
   - Нажмите "Переменные среды"
   - В системных переменных найдите PATH и добавьте путь к папке bin JDK (например, `C:\Program Files\Eclipse Adoptium\jdk-17.0.x-hotspot\bin`)

#### Проверка установки:
```bash
java -version
```

### 2. Apache Maven 3.6 или выше

#### Установка:
1. Перейдите на https://maven.apache.org/download.cgi
2. Скачайте Binary zip archive
3. Распакуйте в папку (например, `C:\tools\maven`)
4. Добавьте Maven в PATH:
   - Добавьте `C:\tools\maven\bin` в системную переменную PATH

#### Проверка установки:
```bash
mvn -version
```

### 3. Альтернативный способ - использование chocolatey (если установлен)

```bash
choco install openjdk17
choco install maven
```

## Запуск приложения

После установки Java и Maven:

1. Откройте PowerShell или Command Prompt
2. Перейдите в папку с проектом
3. Выполните команду:
```bash
mvn spring-boot:run
```

4. Приложение будет доступно по адресу: http://localhost:8080

## Альтернативные способы запуска

### Использование IDE
- Импортируйте проект в IntelliJ IDEA или Eclipse
- Запустите главный класс `UserSystemApplication`

### Создание JAR файла
```bash
mvn clean package
java -jar target/user-system-1.0.0.jar
```

## Если у вас нет прав администратора

Вы можете использовать портативные версии:
- Скачайте портативную версию OpenJDK
- Скачайте портативную версию Maven
- Настройте переменные среды только для текущей сессии:
  ```bash
  $env:JAVA_HOME="C:\path\to\jdk"
  $env:PATH="$env:JAVA_HOME\bin;C:\path\to\maven\bin;$env:PATH"
  ```

## Тестирование без Maven

Если вы не можете установить Maven, можете использовать любую Java IDE:
1. Откройте проект в IDE
2. Убедитесь, что все зависимости скачаны
3. Запустите главный класс `UserSystemApplication` 