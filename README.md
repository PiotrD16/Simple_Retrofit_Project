# Android Retrofit & MVVM Practice App

A training project developed to master the fundamentals of modern Android development. This application demonstrates asynchronous communication with a REST API using Retrofit and implements the MVVM architectural pattern.

## 🚀 Features
- **Fetch Posts:** Displays a list of post titles retrieved asynchronously from the API.
- **Fetch Users:** Handles JSON data (displaying user details along with their addresses).
- **Navigation:** Implements screen transitions using `Intent` objects.
- **Lifecycle Management:** Uses ViewModels to ensure data persistence during configuration changes (e.g., screen rotation).

## 🛠 Tech Stack
- **Language:** Kotlin
- **Architecture:** MVVM (Model-View-ViewModel)
- **Networking:** Retrofit 2 & GSON Converter (JSON parsing)
- **Concurrency:** Kotlin Coroutines (`viewModelScope`, `suspend functions`)
- **UI Components:** ConstraintLayout, ScrollView, and LiveData (for reactive UI updates).

## 📂 Project Structure
The project is organized into layers following the **Separation of Concerns** principle:

- `data/model` – Data classes representing API entities (Post, User, Address).
- `data/network` – Retrofit client configuration and API service interfaces.
- `data/repository` – Abstraction layer for data access.
- `ui/viewmodel` – Business logic, state management, and Coroutine handling.
- `ui/main` – Activities responsible for rendering the User Interface.

## 📖 API Source
This app uses the free [JSONPlaceholder](https://jsonplaceholder.typicode.com/) testing API.
