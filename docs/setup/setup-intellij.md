## plugins

- Rainbow brackets - colors

- SonarLint - find and fix bugs as you type
- .ignore - ignore files for git

- Key promoter x - learn shortcuts

- JPA Buddy - jpa support

- Statistics - code statistics

- Ideolog - logs

- Diagrams.net Integration - draw diagrams
- PlantUML Integration

- Pomodoro-tm

- Yet another emoji support - emoji

## visuals

- enable the toolbar

        View > Appearance > check Toolbar

- enable zoom on text

        File > Settings > Editor > General > check Change font size (Zoom)

- colored text

        File > Settings > Editor > Color Scheme > check Semantic highlighting

## git

- commit strategy

        File > Settings > Version Control > Commit
        in the Before Commit section check
        - reformat code
        - rearrange code
        - optimize imports

## code templates

- add assertj import to all test files

        File > Settings > Editor > File and Code Templates > Code
        select Junit5TestClass
        add at the top: 
            import static org.assertj.core.api.Assertions.assertThat;

## live templates

- add log entry with shortcut `pslog`

      File > Editor > Live Templates
      
      add template:
      
      private static final Logger logger = Logger.getLogger($CLASSNAME$.class.getName());
      
      private static final Logger logger = LoggerFactory.getLogger($CLASSNAME$.class.getName());

      abbreviation: pslog
      description: private static log
      applicable in java: declaration

      edit variables > expression > className() 