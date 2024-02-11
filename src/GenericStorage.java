public class GenericStorage<T> {
    private Object[] items = new Object[0];

    public void addItem(T item) {
        Object[] newItems = new Object[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[items.length] = item;
        items = newItems;
    }

    public void removeItem(int id) {
        Object[] newItems = new Object[items.length - 1];
        int newItemsIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof Student || items[i] instanceof Teacher) {
                if (id != ((Person) items[i]).getId()) {
                    newItems[newItemsIndex++] = items[i];
                }
            }
        }
        items = newItems;
    }

    public void displayAllItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public Object searchItem(int id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof Student || items[i] instanceof Teacher) {
                if (id == ((Person) items[i]).getId()) {
                    return items[i];
                }
            }
        }
        return null;
    }
}
