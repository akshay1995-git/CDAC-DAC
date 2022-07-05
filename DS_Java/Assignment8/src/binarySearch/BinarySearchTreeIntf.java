package binarySearch;
public interface BinarySearchTreeIntf {
	public void Insert(int element);
	public void Delete(int element);
	public boolean Search(int element);

	public int[] InOrder();
}
