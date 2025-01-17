#include <iostream>
#include <vector>
#include <string>

using namespace std;

// We will create a simple to-do list application that allows the user to add, remove, and list tasks.
// The application will store the tasks in a vector of strings.
// The user can enter tasks, list all tasks, remove the last task, or quit the application.

// The application will keep running until the user enters "quit".
// We will show the user a menu of options and ask them to enter a task, list, remove, or quit.
int main() {
    int choice;
    vector<string> tasks;
    string task;

    while (true) {
        cout << "1. Add task" << endl;
        cout << "2. List tasks" << endl;
        cout << "3. Remove last task" << endl;
        cout << "4. Quit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        cin.ignore(); // Ignore the newline character left in the input buffer

        switch (choice) {
            case 1:
                cout << "Enter a task: ";
                getline(cin, task); // Use getline to read the entire line
                tasks.push_back(task);
                break;
            case 2:
                cout << "Tasks:" << endl;
                for (const string& t : tasks) {
                    cout << t << endl;
                }
                break;
            case 3:
                if (!tasks.empty()) {
                    tasks.pop_back();
                } else {
                    cout << "No tasks to remove." << endl;
                }
                break;
            case 4:
                return 0;
            default:
                cout << "Invalid choice" << endl;
        }
    }
    return 0;
}
