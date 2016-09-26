package seedu.addressbook.commands;

import java.util.List;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static String MESSAGE_USAGE = COMMAND_WORD + ":\n"
            + "List out the people in the address book in alphabetical order of their names.\n\t"
            + "Example: " + COMMAND_WORD;

    public final static String COMMAND_FORMAT = "sort";


    @Override
    public CommandResult execute() {

        addressBook.sortPersons();List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }

}
