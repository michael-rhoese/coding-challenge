package com.capgemini.codingchallenge.html.internal;

import static j2html.TagCreator.*;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <h2>HtmlTableGenerator</h2>
 * <p>
 * The HTML table generator uses data and configuration to create a table in HTML format.
 *
 * @author Michael Rhöse
 * @version 0.0.0.0, 03/01/2023
 */
@Service
public class HtmlTableGenerator {

    public String generateHtmlTable() {

        return body(
                table(
                        thead(),
                        tbody(
                                each(List.of(), r -> tr(
                                each(List.of(), c -> td(String.valueOf(c)))
                        )))
                )
        ).render();
    }
}
