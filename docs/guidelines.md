## Guidelines for Safe and Secure Code Commits

This repository uses pre-commit hooks to enforce security and coding standards. To maintain the security and integrity of the repository, follow these guidelines when committing changes:

#### 1. Avoid Hardcoding Secrets

- Never hardcode sensitive information such as API keys, passwords, tokens, database credentials, or private keys in the source code.
- Use secure methods to manage secrets like Store secrets in environment variables. 
- For local testing, use .env files and ensure they are listed in .gitignore.

#### 2. Check Files Before Committing

- Review all changes (git diff) before staging or committing them to ensure no sensitive information is accidentally included.
- Ensure sensitive files, such as configuration files, .env files, and credentials, are excluded from version control by adding them to .gitignore.
- Avoid committing binary files or unnecessary files (e.g., .DS_Store, .log files).