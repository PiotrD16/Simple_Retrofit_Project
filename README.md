# Android Retrofit & MVVM Practice App

A training project developed to master the fundamentals of modern Android development. This application demonstrates asynchronous communication with a REST API using Retrofit and implements a full **MVVM (Model-View-ViewModel)** architectural pattern with a dedicated **Repository layer**.

## 🚀 Features
- **Fetch Posts:** Displays a list of post titles retrieved asynchronously from the API.
- **Fetch Users:** Handles complex, nested JSON data, displaying user details along with their addresses.
- **Navigation:** Implements screen transitions between `MainActivity` and `UserActivity` using `Intent` objects.
- **Repository Pattern:** Logic for data fetching is decoupled from the ViewModels, creating an abstraction layer for data sources.
- **Lifecycle Management:** Uses ViewModels and LiveData to ensure data persistence during configuration changes (e.g., screen rotation).

## 📂 Project Structure
The project follows **Clean Architecture** principles by separating concerns into distinct layers:

- `data/model` – Data classes representing API entities (Post, User, Address).
- `data/network` – Retrofit configuration and API interface definitions.
- `data/repository` – Mediates between the data sources (API) and the ViewModels.
- `ui/viewmodel` – Manages UI state and business logic using Kotlin Coroutines.
- `ui/main` – Activities responsible for rendering the UI and observing LiveData.

## 🛠 Tech Stack
- **Language:** Kotlin
- **Architecture:** MVVM + Repository Pattern
- **Networking:** Retrofit 2 & GSON Converter
- **Concurrency:** Kotlin Coroutines (`viewModelScope`, `suspend functions`)
- **UI Components:** ConstraintLayout (chains, match constraints), ScrollView, and LiveData.

## 💡 Key Takeaways
While building this project, I gained practical experience in:
1. **Repository Pattern:** Understanding how to abstract data sources, making the app more scalable and testable.
2. **Multithreading:** Managing Main vs. IO threads to keep the UI responsive.
3. **API Mapping:** Converting nested JSON structures into Kotlin objects using GSON annotations.
4. **Reactive UI:** Using the Observer pattern to automatically update the UI when data changes in the Repository.
5. **Modern Layouts:** Building responsive interfaces with `ConstraintLayout` using Chains and properly anchored views.

## 📖 API Source
This app uses the free [JSONPlaceholder](https://jsonplaceholder.typicode.com/) testing API.
