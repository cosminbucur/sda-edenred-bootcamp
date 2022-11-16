# lombok

## concepts

- getters, setters
- constructors
    - @RequiredArgsConstructor
    - static factory methods @AllArgsConstructor
    - static factory methods @RequiredArgsConstructor
- builder
    - @Builder
    - @Accessors
    - @Singular
- logger
    - @Slf4j

## best practices

- entity
    - don't put @Data to @Entity (entities)
    - don't use @ToString (lazy load problems)
    - don't use parent.getChildren().add() => use addChild()
    - getter for children should return unmodifiable list
    - don't use @Hashcode @Equals on entities

- dto
    - use @Data on value objects
    - use @Value (no need for private fields)

- service
    - all spring services have @RequiredArgsConstructor
    - @Autowired not needed on constructor
    - use @Slf4j for services
