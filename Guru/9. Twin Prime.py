def is_prime(n): 
    if n < 2: 
        return False     
    for i in range(2, int(n ** 0.5) + 1):         
        if n % i == 0:             
            return False    
    return True 
 
def find_twin_primes(start, end):   
    for num in range(start, end): 
        if is_prime(num) and is_prime(num + 2): 
            print(num, num + 2) 
 
start = int(input("Enter start: ")) 
end = int(input("Enter end: "))
find_twin_primes(start, end) 
