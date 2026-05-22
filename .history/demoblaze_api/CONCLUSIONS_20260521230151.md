# Automated E2E Testing (Demoblaze Store)

*Date:* May 2026 <br>
*Target:* Add two items to cart ant place order <br>
*Status:* Passed

---

## Conclusions

- This project is designed for API testing using Karate.
- The structure uses `features` for each endpoint.
- Karate reports are included to help debugging.

## About the web:

- Tested endpoints worked as expected, considering several test cases for each one
- Responses for some cases could be improved, providing a better message instead empty. For ewxample, when a user is created, username or an ID should be given by the endpoint response.
- More API tests could be added following the current structure by adding more features for other endpoints or adding more scenarios for each feature.