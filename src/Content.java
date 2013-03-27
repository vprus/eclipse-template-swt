import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;


public class Content extends Composite {

	public Content(Shell shell)
	{
		super(shell, SWT.NONE);
	}
	
	@Override
	public Point computeSize(int wHint, int hHint) {
		return new Point(600, 225);
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		return computeSize(wHint, hHint);
	}
}
