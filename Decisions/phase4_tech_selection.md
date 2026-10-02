# Phase 4 — Technology Choices and Justification

This section records the key technology choices made during Phase 4 and the reasoning behind selecting them.

| Choice             | Why We Chose It                                                                     | Why Not the Alternative                                                                                         |
| ------------------ | ----------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| Local HTML file    | Provides a simple webpage that can be loaded directly inside the JavaFX `WebView`.  | Using an external website would introduce an unnecessary dependency on internet access.                         |
| JavaFX WebEngine   | Provides the required functionality to load the local HTML file into the `WebView`. | `WebView` alone is mainly responsible for displaying the webpage and does not provide the page-loading control. |
| `getResource()`    | Allows the application to locate `webpage.html` from the project's resources.       | Using a hard-coded file path would make the application dependent on a specific computer or folder structure.   |
| `toExternalForm()` | Converts the resource location into a URL format that `WebEngine` can understand.   | Passing the resource object directly would not provide the URL format required by `WebEngine.load()`.           |

## Design Approach

We decided to load a local HTML file from the project's resources instead of depending on an external webpage.

The HTML file is located using `getResource()`, converted into a URL using `toExternalForm()`, and then passed to `webEngine.load()`.

This approach keeps the webpage as part of the project and makes the application easier to run on different systems without depending on a particular local file path.

## Key Decision

The main approach followed in Phase 4 was:

**Store HTML as a project resource → locate it using `getResource()` → convert it into a URL → load it using WebEngine.**
