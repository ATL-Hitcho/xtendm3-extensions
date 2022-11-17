class CustomerCreditCheckP1 extends ExtendM3Trigger {
  private final SessionAPI session
  private final InteractiveAPI interactive
 
  CustomerCreditCheckP1(SessionAPI session, InteractiveAPI interactive) {
    this.session = session
    this.interactive = interactive
  }

  //Adding comment to test push and commit.
  void main() {
    session.parameters.put("creditLimit", interactive.display.fields.get("WRCRLM"))
  }
}
