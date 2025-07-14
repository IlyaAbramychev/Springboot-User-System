# Инструкции по созданию репозитория на GitHub

## Шаг 1: Создание репозитория на GitHub

1. Откройте браузер и перейдите на https://github.com
2. Войдите в свой аккаунт GitHub
3. Нажмите кнопку "New repository" (зеленая кнопка) или "+"
4. Заполните форму:
   - **Repository name**: `Springboot-User-System`
   - **Description**: `Демонстрационное Spring Boot API-приложение для управления пользователями`
   - **Visibility**: Public (или Private, если нужно)
   - **НЕ ставьте галочки** на "Add a README file", "Add .gitignore", "Choose a license" (у нас уже есть эти файлы)
5. Нажмите "Create repository"

## Шаг 2: Подключение локального репозитория к GitHub

После создания репозитория на GitHub, скопируйте URL вашего репозитория (например: `https://github.com/yourusername/Springboot-User-System.git`)

Затем выполните следующие команды в PowerShell:

```bash
# Добавить remote origin
git remote add origin https://github.com/yourusername/Springboot-User-System.git

# Переименовать ветку в main (если нужно)
git branch -M main

# Запушить код на GitHub
git push -u origin main
```

## Шаг 3: Проверка

После выполнения команд:
1. Обновите страницу репозитория на GitHub
2. Убедитесь, что все файлы загружены
3. Проверьте, что README.md отображается на главной странице

## Альтернативный способ (если у вас есть SSH ключ)

Если у вас настроен SSH ключ для GitHub:

```bash
# Используйте SSH URL вместо HTTPS
git remote add origin git@github.com:yourusername/Springboot-User-System.git
git branch -M main
git push -u origin main
```

## Готовые команды для копирования

Замените `yourusername` на ваш GitHub username:

```bash
git remote add origin https://github.com/yourusername/Springboot-User-System.git
git branch -M main
git push -u origin main
```

## Что делать дальше

После успешного пуша вы можете:
- Добавить описание проекта на GitHub
- Настроить GitHub Pages для документации
- Добавить badges в README.md
- Создать releases для версий приложения 