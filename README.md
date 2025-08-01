# Sales Statistics Component

This Java component provides essential sales analysis by calculating core metrics like total, average, minimum, and maximum. It serves as a practical example of the 'Beyond' component structure, leveraging clean architecture and the use of interfaces, ports, and adapters to create a flexible, decoupled, and highly extensible solution for processing sales data.

## Project Structure

```bash
sales_statistics_component/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/ifsp/luan/sales_statistics_component/
│   │           ├── internal/               # Core business logic (SalesStatistics)
│   │           ├── provided/               # Provided interfaces and ports
│   │           └── required/               # Required interfaces and outbox ports
│   └── test/                               # Unit tests
├── pom.xml                                 # Maven configuration
```

## Main Classes

- `SalesStatistics`: Core class for calculating sales statistics (total, average, max, min).
- `SalesStatisticsInterface`: Component interface exposing sales statistics operations.
- `SalesStatisticsInterfacePort`: Port for interacting with the sales statistics calculator.
- `ProvidedSalesStatistics`: Interface defining provided sales statistics operations.
- `RequiredSalesStatistics`: Interface for required sales statistics operations (for extensibility).

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

### Installation

To use this component in your own Maven project, add the following to your `pom.xml`:

- Add the GitHub Packages repository:

```xml
<repositories>
    <repository>
        <id>sales_statistics_component</id>
        <url>https://maven.pkg.github.com/Tavaress17/sales_statistics_component</url>
    </repository>
</repositories>
```

- Add the dependency:

```xml
<dependency>
    <groupId>com.ifsp.luan</groupId>
    <artifactId>sales_statistics_component</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Build

```bash
mvn clean install
```

### Run Tests

```bash
mvn test
```