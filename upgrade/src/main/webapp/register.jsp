<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Free Account</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f8;
        }

        .register-box {
            max-width: 700px;
            margin: 60px auto;
            background: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }

        .title-bar {
            background-color: #2e8cb8;
            color: white;
            padding: 12px;
            text-align: center;
            font-weight: 600;
            border-radius: 4px;
            margin-bottom: 25px;
        }

        .social-btn {
            width: 100%;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="register-box">

        <!-- Registration Form -->
        <form action="registerData" method="post">

            <div class="row mb-3">
                <div class="col">
                    <label class="form-label">First Name</label>
                    <input type="text" name="firstName" class="form-control" required>
                </div>

                <div class="col">
                    <label class="form-label">Last Name</label>
                    <input type="text" name="lastName" class="form-control" required>
                </div>
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" class="form-control" placeholder="you@example.com" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" class="form-control" required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-success">
                    Register
                </button>
            </div>

        </form>

    </div>
</div>

</body>
</html>
