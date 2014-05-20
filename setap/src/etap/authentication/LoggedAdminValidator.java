package etap.authentication;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class LoggedAdminValidator{

	@Autowired(required = true)
	private HttpServletRequest request;
	
	@Pointcut("execution(* admincontrollers.*.*(..))")
	public void pagesInvocation() {
	}
	
	@Around("pagesInvocation()")
	public Object invoke(ProceedingJoinPoint pjp) throws Throwable {

		try {
			/*HttpSession httpSession = request.getSession(true);

			if (httpSession.isNew()
					|| httpSession.getAttribute("root") == null) {				
				return new ModelAndView("redirect:/login.do");
			}
			*/
			return pjp.proceed();
		} finally {
		}
	}
	
}
