# DEMOBLAZE e2e test 

This repository is a project for an automated E2E test using Serenity BDD.

## Quick overview:
- Contains an example test that use Page Objects and Action classes to add two items from `https://www.demoblaze.com/` to the cart and then complete the purchase.
- Tests can be run Maven, and Serenity produces HTML reports with evidence (screenshots, page sources, etc.).

## Why the project is organized this way
- The `actions` and `pageobjects` folders are intentionally structured for scalability: reusable interactions are implemented as Actions, while selectors and page operations live in PageObjects. This makes it easy to add many more tests in the future without duplicating logic.

## Run the tests
1. Open PowerShell at the project root
2. Run:

```powershell
mvn verify
```

## View reports
- Serenity report: `target/site/serenity/index.html`

## Notes
- `serenity.conf` is configured to capture screenshots in case of failure (useful for debugging).
- When adding tests, put them under `src/test/java/starter` and follow the existing `actions` + `pageobjects` pattern to keep tests maintainable and reusable.

## Contributing
- If you add tests, try to keep Actions generic and PageObjects focused on page structure so others can reuse them easily.

Enjoy working with the project.