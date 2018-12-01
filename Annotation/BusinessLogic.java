public class BusinessLogic {
	public BusinessLogic() {
		super();
	}
	public void completedMethod() {
		System.out.println("This method is completed");
	}
	@Todo(priority = Todo.Priority.HIGH)
	public void notStartedYet() {
		System.out.println("This method is completed");
	}
	@Todo(priority = Todo.Priority.MEDIUM, author="Hello1", status = Todo.Status.STARTED)
	public void incompleteMethod1() {
		System.out.println("This method is incomplete");
	}
	@Todo(priority = Todo.Priority.LOW, author="Hello2", status = Todo.Status.STARTED)
	public void incompleteMethod2() {
		System.out.println("This method is incomplete");
	}
}