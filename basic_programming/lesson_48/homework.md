
<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>


Task 1.
Finish and improve the ToDoList application in your opinion.

Task 2.
Read instructions on working with GitHub in the collaborative development mode.
https://docs.github.com/ru/pull-requests

## Instructions from ChatGPT:
Collaborative code development using Git and GitHub allows several developers to work on one project, saving changes and ensuring their integration into the main code. Here is a detailed scenario describing the collaborative development process:

### 1. **Creating a repository and setting up access**
- **The project initiator** creates a repository on GitHub:
- Goes to GitHub, creates a new repository and determines its visibility (public or private).
- The repository contains the main branch (by default `main` or `master`).
- **Inviting Collaborators**:
- The initiator adds collaborators to the repository via Settings → "Collaborators", or the repository is kept public so that others can fork it.

### 2. **Cloning a repository by collaborators**
- **Collaborators** clone the repository to their local machines:
  Command in the terminal:
```bash
git clone https://github.com/username/repository-name.git
```
From IntelliJ IDEA:

Get a link to the repository from GitHub
File-New-From version control - paste the link

- This creates a copy of the repository on the collaborator's local machine, which he will work with.

### 3. **Creating a new branch for a task**
- **A participant**, working on a new feature or bug fix, creates a separate branch:
```bash
git checkout -b feature-branch-name
```
From IntelliJ IDEA:
Git menu - Create new branch

- This helps to isolate changes that are made within a specific task and not affect the main branch.

### 4. **Working on code**
- A participant makes changes to the code (in his branch!), adds new files or edits existing ones.
- After completing a certain amount of work, he adds the changed files to the index (staging area):
```bash
git add .
```
- Then he makes a commit with a message describing the changes he made:
```bash
git commit -m "Description of changes"
```
From IntelliJ IDEA:
GIT menu - Commit

### 5. **Pushing changes to GitHub**
- After committing the changes, the contributor pushes his branch to the remote repository:
```bash
git push origin feature-branch-name
```
From IntelliJ IDEA:
GIT menu - Push...

- This creates a copy of the branch on GitHub, available for viewing by other contributors.

### 6. **Creating a Pull Request (PR)**
- The contributor creates a Pull Request on GitHub to propose integrating his changes into the main branch:
- Goes to his fork or repository on GitHub and clicks the "Compare & pull request" button.
- Specifies the merge target (e.g. `main` or `master`) and selects their branch.
- Writes a description of the PR, stating what changes were made and why.
- This allows other contributors and the project maintainer to review the changes and leave comments.

### 7. **Discuss and review changes**
- Other contributors or the **project maintainer** review the PR and can leave comments or request changes.
- The submitter makes edits if needed and pushes the updated changes:
```bash
git add .
git commit -m "Reviewed fixes"
git push origin feature-branch-name
```
- GitHub automatically updates the PR with the latest changes.

### 8. **Merge a PR into the master branch**
- Once all contributors agree on the changes, the **project initiator** or another authorized contributor merges the PR:
- In the GitHub interface, click "Merge pull request".
- This merges the changes into the master branch and makes them available to all contributors.
- The contributor can delete their branch after the merge to avoid cluttering the repository.

### 9. **Update local copies of the repository**
- All contributors sync their local repositories with the updated master branch:
```bash
git checkout main
git pull origin main
```
- This ensures that every developer is working with the latest version of the code.

### 10. **Manage conflicts**
- When merging branches, conflicts may arise if the changes affect the same lines of code.
- If there is a conflict, Git will warn you about it, and you have to manually fix the conflicting files and then commit:
```bash
git add conflicting-file
git commit -m "Fixed conflicts"
git push origin feature-branch-name
```
- You can then request the merge again.

### 11. **Cycling the process**
- This process is repeated for each new issue, feature, or bug fix.
- Over time, the project evolves, and all changes go through branching, review, and merging.

### 12. **Using Tags and Releases**
- As you complete significant project milestones, you can create **tags**:
```bash
git tag -a v1.0 -m "Release Description v1.0"
git push origin v1.0
```

- On GitHub, you can create **releases**, which help package the finished version of the product with a description and files.

### The main advantages of this approach:
- **Clarity and structure**: Each task is isolated in its own branch, which simplifies code management.
- **Transparency**: All participants can see changes, leave comments and track the history of work.
- **Protection of the main branch**: Changes are reviewed before merging, which reduces the risk of introducing errors into the main branch.

This scenario is suitable for teams of different sizes and project complexity, from small startups to large open-source projects.


</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

Задание 1.
Закончить и усовершенствовать на свой взгляд приложение ToDoList.

Задание 2.
Читать инструкции о работе с GitHub в режиме коллективной разработки.
https://docs.github.com/ru/pull-requests

## Инструкция от ChatGPT:
Совместная разработка кода с использованием Git и GitHub позволяет нескольким разработчикам работать над одним проектом, сохраняя изменения и обеспечивая их интеграцию в основной код. Вот подробный сценарий, описывающий процесс совместной разработки:

### 1. **Создание репозитория и настройка доступа**
- **Инициатор проекта** создает репозиторий на GitHub:
    - Переходит на GitHub, создает новый репозиторий и определяет его видимость (публичный или приватный).
    - Репозиторий содержит основную ветку (по умолчанию `main` или `master`).
- **Приглашение участников**:
    - Инициатор добавляет участников в репозиторий через настройки → "Collaborators", или репозиторий остается публичным, чтобы другие могли делать форки.

### 2. **Клонирование репозитория участниками**
- **Участники** клонируют репозиторий на свои локальные машины:
Команда в терминале:
  ```bash
  git clone https://github.com/username/repository-name.git
  ```
Из IntelliJ IDEA: 
Взять ссылку на репозиторий с GitHub
File-New-From version control - вставить ссылку

- Это создает копию репозитория на локальной машине участника, с которой он будет работать.

### 3. **Создание новой ветки для задачи**
- **Участник**, работая над новой функцией или исправлением ошибки, создает отдельную ветку:
  ```bash
  git checkout -b feature-branch-name
  ```
Из IntelliJ IDEA:
меню Git - Create new branch

- Это помогает изолировать изменения, которые вносятся в рамках конкретной задачи, и не затрагивать основную ветку.

### 4. **Работа над кодом**
- Участник вносит изменения в код (в своей ветке!), добавляет новые файлы или редактирует существующие.
- После завершения определенного объема работы, он добавляет измененные файлы в индекс (staging area):
  ```bash
  git add .
  ```
- Затем он делает коммит с сообщением, описывающим внесенные изменения:
  ```bash
  git commit -m "Описание изменений"
  ```
Из IntelliJ IDEA:
Меню GIT - Commit

### 5. **Отправка изменений на GitHub**
- После коммита изменений, участник отправляет свою ветку в удаленный репозиторий:
  ```bash
  git push origin feature-branch-name
  ```
Из IntelliJ IDEA:
Меню GIT - Push...

- Это создает копию ветки на GitHub, доступную для просмотра другими участниками.

### 6. **Создание Pull Request (PR)**
- Участник создает Pull Request на GitHub, чтобы предложить интеграцию своих изменений в основную ветку:
    - Переходит в свой форк или репозиторий на GitHub и нажимает кнопку "Compare & pull request".
    - Указывает цель слияния (например, `main` или `master`) и выбирает свою ветку.
    - Пишет описание PR, указывает, какие изменения были внесены и почему.
- Это позволяет другим участникам и инициатору проекта просмотреть изменения и оставить комментарии.

### 7. **Обсуждение и ревью изменений**
- Другие участники или **инициатор проекта** просматривают PR и могут оставить комментарии или запросить изменения.
- Участник, подавший PR, вносит правки, если это необходимо, и отправляет обновленные изменения:
  ```bash
  git add .
  git commit -m "Исправления по ревью"
  git push origin feature-branch-name
  ```
- GitHub автоматически обновляет PR с учетом последних изменений.

### 8. **Слияние (Merge) PR в основную ветку**
- После того как все участники согласны с изменениями, **инициатор проекта** или другой уполномоченный участник сливает PR:
    - В интерфейсе GitHub нажимает "Merge pull request".
    - Это объединяет изменения в основную ветку и делает их доступными для всех участников.
- Участник может удалить свою ветку после слияния, чтобы не засорять репозиторий.

### 9. **Обновление локальных копий репозитория**
- Все участники синхронизируют свои локальные репозитории с обновленной основной веткой:
  ```bash
  git checkout main
  git pull origin main
  ```
- Это гарантирует, что каждый разработчик работает с последней версией кода.

### 10. **Управление конфликтами**
- При слиянии веток могут возникнуть конфликты, если изменения затрагивают одни и те же строки кода.
- В случае конфликта, Git предупредит о нем, и участник должен вручную исправить конфликтующие файлы, а затем сделать коммит:
  ```bash
  git add конфликтующий-файл
  git commit -m "Исправлены конфликты"
  git push origin feature-branch-name
  ```
- После этого можно снова запросить слияние.

### 11. **Цикличность процесса**
- Этот процесс повторяется для каждой новой задачи, функции или исправления ошибки.
- Постепенно проект развивается, и все изменения проходят через ветвление, ревью и слияние.

### 12. **Использование тегов и релизов**
- По мере завершения значимых этапов проекта можно создавать **теги**:
  ```bash
  git tag -a v1.0 -m "Описание релиза v1.0"
  git push origin v1.0
  ```
- На GitHub можно создавать **релизы**, которые помогают упаковать готовую версию продукта с описанием и файлами.

### Основные преимущества такого подхода:
- **Четкость и структура**: Каждая задача изолируется в своей ветке, что упрощает управление кодом.
- **Прозрачность**: Все участники могут видеть изменения, оставлять комментарии и отслеживать историю работы.
- **Защита основной ветки**: Изменения проходят проверку перед слиянием, что снижает риск внесения ошибок в основную ветку.

Этот сценарий подходит для команд разного размера и сложности проектов, от небольших стартапов до крупных open-source проектов.

</details>
